import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddclaimComponent } from './addclaim.component';

describe('AddclaimComponent', () => {
  let component: AddclaimComponent;
  let fixture: ComponentFixture<AddclaimComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddclaimComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddclaimComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
