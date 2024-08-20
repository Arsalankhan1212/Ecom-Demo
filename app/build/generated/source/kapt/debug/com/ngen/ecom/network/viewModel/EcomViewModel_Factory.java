package com.ngen.ecom.network.viewModel;

import com.ngen.ecom.network.repository.EcomRepository;
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
public final class EcomViewModel_Factory implements Factory<EcomViewModel> {
  private final Provider<EcomRepository> repositoryProvider;

  public EcomViewModel_Factory(Provider<EcomRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public EcomViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static EcomViewModel_Factory create(Provider<EcomRepository> repositoryProvider) {
    return new EcomViewModel_Factory(repositoryProvider);
  }

  public static EcomViewModel newInstance(EcomRepository repository) {
    return new EcomViewModel(repository);
  }
}
