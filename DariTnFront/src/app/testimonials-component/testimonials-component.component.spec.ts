import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestimonialsComponentComponent } from './testimonials-component.component';

describe('TestimonialsComponentComponent', () => {
  let component: TestimonialsComponentComponent;
  let fixture: ComponentFixture<TestimonialsComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestimonialsComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestimonialsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
