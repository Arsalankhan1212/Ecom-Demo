import android.text.Editable
import android.text.Html
import org.xml.sax.XMLReader

class CustomTagHandler : Html.TagHandler {
    override fun handleTag(
        opening: Boolean,
        tag: String,
        output: Editable,
        xmlReader: XMLReader
    ) {
        when {
            tag.equals("ul", ignoreCase = true) -> handleListTag(opening, output)
            tag.equals("ol", ignoreCase = true) -> handleListTag(opening, output)
            tag.equals("li", ignoreCase = true) -> handleListItemTag(opening, output)
            tag.equals("strong", ignoreCase = true) || tag.equals("b", ignoreCase = true) -> handleStrongTag(opening, output)
            tag.equals("em", ignoreCase = true) || tag.equals("i", ignoreCase = true) -> handleEmTag(opening, output)
            tag.equals("table", ignoreCase = true) -> handleTableTag(opening, output)
            tag.equals("tr", ignoreCase = true) -> handleTableRowTag(opening, output)
            tag.equals("td", ignoreCase = true) -> handleTableDataTag(opening, output)
            // Add more cases for other tags as needed
        }
    }

    private fun handleListTag(opening: Boolean, output: Editable) {
        if (opening) {
            output.append("\n")
        } else {
            output.append("\n")
        }
    }

    private fun handleListItemTag(opening: Boolean, output: Editable) {
        if (opening) {
            output.append("    • ") // Use any bullet character or indentation you prefer
        } else {
            output.append("\n")
        }
    }

    private fun handleStrongTag(opening: Boolean, output: Editable) {
        if (opening) {
            // You can apply custom styling for strong text
            output.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD), output.length, output.length, 0)
        }
    }

    private fun handleEmTag(opening: Boolean, output: Editable) {
        if (opening) {
            // You can apply custom styling for emphasized text
            output.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.ITALIC), output.length, output.length, 0)
        }
    }

    private fun handleTableTag(opening: Boolean, output: Editable) {
        if (!opening) {
            output.append("\n")
        }
    }

    private fun handleTableRowTag(opening: Boolean, output: Editable) {
        if (opening) {
            output.append("\n")
            output.append("-------------------------------\n")
        } else {
            output.append("\n")
            output.append("-------------------------------\n")
        }
    }

    private fun handleTableDataTag(opening: Boolean, output: Editable) {
        if (opening) {
            output.append("| ")
        } else {
            output.append(" | ")
        }
    }
}
