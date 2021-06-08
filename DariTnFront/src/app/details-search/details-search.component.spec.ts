import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsSearchComponent } from './details-search.component';

describe('DetailsSearchComponent', () => {
  let component: DetailsSearchComponent;
  let fixture: ComponentFixture<DetailsSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
