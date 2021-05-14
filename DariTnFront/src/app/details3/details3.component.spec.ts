import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Details3Component } from './details3.component';

describe('Details3Component', () => {
  let component: Details3Component;
  let fixture: ComponentFixture<Details3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Details3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Details3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
