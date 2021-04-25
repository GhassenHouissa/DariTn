import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LatestNewsComponentComponent } from './latest-news-component.component';

describe('LatestNewsComponentComponent', () => {
  let component: LatestNewsComponentComponent;
  let fixture: ComponentFixture<LatestNewsComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LatestNewsComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LatestNewsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
