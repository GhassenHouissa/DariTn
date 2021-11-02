import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LatestPropertiesComponentComponent } from './latest-properties-component.component';

describe('LatestPropertiesComponentComponent', () => {
  let component: LatestPropertiesComponentComponent;
  let fixture: ComponentFixture<LatestPropertiesComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LatestPropertiesComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LatestPropertiesComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
