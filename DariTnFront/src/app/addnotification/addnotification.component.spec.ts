import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnotificationComponent } from './addnotification.component';

describe('AddnotificationComponent', () => {
  let component: AddnotificationComponent;
  let fixture: ComponentFixture<AddnotificationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddnotificationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddnotificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
