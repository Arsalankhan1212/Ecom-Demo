package com.ngen.ecom.ui.fragments.products

import CustomTagHandler
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.Html
import android.text.Spannable
import android.text.method.LinkMovementMethod
import android.text.style.ImageSpan
import android.text.style.QuoteSpan
import android.text.style.URLSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.ngen.ecom.R
import com.ngen.ecom.databinding.FragmentAboutProductBinding
import com.ngen.ecom.utils.Constants
import com.ngen.ecom.utils.ImageGetter
import com.ngen.ecom.utils.QuoteSpanClass
import org.xml.sax.XMLReader

class AboutProductFragment : Fragment() {
    private var _binding : FragmentAboutProductBinding ?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutProductBinding.inflate(inflater,container,false)

        val description = Constants.product?.description?.replace(
            Regex("<(script|style).*?</\\1>", RegexOption.DOT_MATCHES_ALL), "") ?: ""

        parseAndDisplayDescription(description)
        return _binding?.root
    }

    //Parsing html description to display images and Quote if any
    private fun parseAndDisplayDescription(html: String) {

        // Creating object of ImageGetter class you just created
        val imageGetter = ImageGetter(resources, _binding!!.tvDescription, requireContext())

        // Using Html framework to parse html
        val styledText = HtmlCompat.fromHtml(
            html,
            HtmlCompat.FROM_HTML_MODE_LEGACY,
            imageGetter,  CustomTagHandler()
        )

        replaceQuoteSpans(styledText as Spannable)
        imageClickWithinDescription(styledText)

        // to enable image/link clicking
        _binding?.tvDescription?.movementMethod = LinkMovementMethod.getInstance()

        // setting the text after formatting html and downloading and setting images
        _binding?.tvDescription?.text = styledText
    }

    //displaying Quote if any within description
    private fun replaceQuoteSpans(spannable: Spannable) {
        val quoteSpans: Array<QuoteSpan> =
            spannable.getSpans(0, spannable.length - 1, QuoteSpan::class.java)

        for (quoteSpan in quoteSpans) {
            val start: Int = spannable.getSpanStart(quoteSpan)
            val end: Int = spannable.getSpanEnd(quoteSpan)
            val flags: Int = spannable.getSpanFlags(quoteSpan)
            spannable.removeSpan(quoteSpan)
            spannable.setSpan(
                QuoteSpanClass(
                    // background color
                    ContextCompat.getColor(requireContext(), R.color.color_light_gray),
                    // strip color
                    ContextCompat.getColor(requireContext(), R.color.color_deep_gray),
                    // strip width
                    10F, 50F
                ),
                start, end, flags
            )
        }
    }

    private fun imageClickWithinDescription(html: Spannable) {
        for (span in html.getSpans(0, html.length, ImageSpan::class.java)) {
            val flags = html.getSpanFlags(span)
            val start = html.getSpanStart(span)
            val end = html.getSpanEnd(span)
            html.setSpan(object : URLSpan(span.source) {
                override fun onClick(v: View) {
                    if (span.source!!.isNotEmpty()) {
                        Intent(Intent.ACTION_VIEW, Uri.parse(span.source)).apply {
                            startActivity(this)
                        }
                    }

                }
            }, start, end, flags)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}