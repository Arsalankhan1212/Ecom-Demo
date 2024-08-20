package com.ngen.ecom.network.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ngen.ecom.model.cart.CartItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDao_Impl implements CartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartItem> __insertionAdapterOfCartItem;

  private final EntityDeletionOrUpdateAdapter<CartItem> __updateAdapterOfCartItem;

  private final SharedSQLiteStatement __preparedStmtOfIncrementQuantity;

  private final SharedSQLiteStatement __preparedStmtOfDecrementQuantity;

  private final SharedSQLiteStatement __preparedStmtOfRemoveCartItemById;

  private final SharedSQLiteStatement __preparedStmtOfClearCart;

  public CartDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartItem = new EntityInsertionAdapter<CartItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Cart` (`id`,`productId`,`title`,`price`,`imageUrl`,`sku`,`quantity`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartItem entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        statement.bindLong(2, entity.getProductId());
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        statement.bindDouble(4, entity.getPrice());
        if (entity.getImageUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getImageUrl());
        }
        if (entity.getSku() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSku());
        }
        statement.bindLong(7, entity.getQuantity());
      }
    };
    this.__updateAdapterOfCartItem = new EntityDeletionOrUpdateAdapter<CartItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Cart` SET `id` = ?,`productId` = ?,`title` = ?,`price` = ?,`imageUrl` = ?,`sku` = ?,`quantity` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartItem entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        statement.bindLong(2, entity.getProductId());
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        statement.bindDouble(4, entity.getPrice());
        if (entity.getImageUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getImageUrl());
        }
        if (entity.getSku() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSku());
        }
        statement.bindLong(7, entity.getQuantity());
        if (entity.getId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getId());
        }
      }
    };
    this.__preparedStmtOfIncrementQuantity = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE Cart SET quantity = quantity + 1 WHERE productId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDecrementQuantity = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE Cart SET quantity = quantity - 1 WHERE productId = ? AND quantity > 1";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveCartItemById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Cart WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Cart";
        return _query;
      }
    };
  }

  @Override
  public Object addToCart(final CartItem cartItem, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfCartItem.insertAndReturnId(cartItem);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateCartItem(final CartItem cartItem,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCartItem.handle(cartItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object incrementQuantity(final int productId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementQuantity.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, productId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfIncrementQuantity.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object decrementQuantity(final int productId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDecrementQuantity.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, productId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDecrementQuantity.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object removeCartItemById(final int cartItemId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveCartItemById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, cartItemId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfRemoveCartItemById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearCart(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCart.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearCart.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<CartItem>> getAllCartItems() {
    final String _sql = "SELECT * FROM Cart";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"Cart"}, false, new Callable<List<CartItem>>() {
      @Override
      @Nullable
      public List<CartItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final List<CartItem> _result = new ArrayList<CartItem>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final CartItem _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            _item = new CartItem(_tmpId,_tmpProductId,_tmpTitle,_tmpPrice,_tmpImageUrl,_tmpSku,_tmpQuantity);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
