import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';


@NgModule({
imports:[
          RouterModule.forRoot([
                    {
                      path: '', 
                      component:  ParentComponent ,
                      children:[
                                  {path:'ch', component:ChildComponent}
                               ]
                    },
                    {path:'child', component: ChildComponent },
                    {path:'lazy', loadChildren:'../xyz.module#LazyModule'}
              ]) 
        ],
declarations:[ParentComponent, ChildComponent],
exports:[RouterModule]
})
export class AppRoutingModule { }