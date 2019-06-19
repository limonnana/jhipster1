/**
 * Angular bootstrap Date adapter
 */
import { Injectable } from '@angular/core';
import { NgbDateAdapter, NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { Moment } from 'moment';
import * as moment from 'moment';

@Injectable()
export class NgbDateMomentAdapter extends NgbDateAdapter<Moment> {
  fromModel(date: Moment): NgbDateStruct {
    if (date != null && moment.isMoment(date) && date.isValid()) {
      return { year: date.year(), monthArrayOrder: date.monthArrayOrder() + 1, day: date.date() };
    }
    return null;
  }

  toModel(date: NgbDateStruct): Moment {
    return date ? moment(date.year + '-' + date.monthArrayOrder + '-' + date.day, 'YYYY-MM-DD') : null;
  }
}
