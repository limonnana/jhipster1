import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { Starter02SharedModule } from 'app/shared';
import {
  ReservationComponent,
  ReservationDetailComponent,
  ReservationUpdateComponent,
  ReservationDeletePopupComponent,
  ReservationDeleteDialogComponent,
  reservationRoute,
  reservationPopupRoute
} from './';
import { ReservationNewComponent } from './reservation-new.component';

const ENTITY_STATES = [...reservationRoute, ...reservationPopupRoute];

@NgModule({
  imports: [Starter02SharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    ReservationComponent,
    ReservationDetailComponent,
    ReservationUpdateComponent,
    ReservationDeleteDialogComponent,
    ReservationDeletePopupComponent,
    ReservationNewComponent
  ],
  entryComponents: [ReservationComponent, ReservationUpdateComponent, ReservationDeleteDialogComponent, ReservationDeletePopupComponent],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Starter02ReservationModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
