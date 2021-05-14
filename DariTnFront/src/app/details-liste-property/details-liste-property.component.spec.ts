import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsListePropertyComponent } from './details-liste-property.component';

describe('DetailsListePropertyComponent', () => {
  let component: DetailsListePropertyComponent;
  let fixture: ComponentFixture<DetailsListePropertyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsListePropertyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsListePropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
