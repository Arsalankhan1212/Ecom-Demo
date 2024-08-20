package com.ngen.ecom.network.repository;

import com.ngen.ecom.network.api.EcomAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EcomRepository_Factory implements Factory<EcomRepository> {
  private final Provider<EcomAPI> ecomApiProvider;

  public EcomRepository_Factory(Provider<EcomAPI> ecomApiProvider) {
    this.ecomApiProvider = ecomApiProvider;
  }

  @Override
  public EcomRepository get() {
    return newInstance(ecomApiProvider.get());
  }

  public static EcomRepository_Factory create(Provider<EcomAPI> ecomApiProvider) {
    return new EcomRepository_Factory(ecomApiProvider);
  }

  public static EcomRepository newInstance(EcomAPI ecomApi) {
    return new EcomRepository(ecomApi);
  }
}
