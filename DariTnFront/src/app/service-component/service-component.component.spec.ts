import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceComponentComponent } from './service-component.component';

describe('ServiceComponentComponent', () => {
  let component: ServiceComponentComponent;
  let fixture: ComponentFixture<ServiceComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServiceComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServiceComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
