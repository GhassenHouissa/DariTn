import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListePropertyComponent } from './liste-property.component';

describe('ListePropertyComponent', () => {
  let component: ListePropertyComponent;
  let fixture: ComponentFixture<ListePropertyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListePropertyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListePropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
