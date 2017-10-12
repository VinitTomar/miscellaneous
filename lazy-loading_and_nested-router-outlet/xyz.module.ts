import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { LazyComponent } from './lazy/lazy.component';


@NgModule({
  imports:[ CommonModule,
            RouterModule.forChild([
              { path:'', component:LazyComponent}
            ])
          ],
  declarations:[LazyComponent]
})
export class LazyModule{}