import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Starter02SharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [Starter02SharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [Starter02SharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Starter02SharedModule {
  static forRoot() {
    return {
      ngModule: Starter02SharedModule
    };
  }
}
