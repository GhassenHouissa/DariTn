import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutComponentComponent } from './about-component.component';

describe('AboutComponentComponent', () => {
  let component: AboutComponentComponent;
  let fixture: ComponentFixture<AboutComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
