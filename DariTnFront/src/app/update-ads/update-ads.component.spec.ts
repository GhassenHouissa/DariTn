import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAdsComponent } from './update-ads.component';

describe('UpdateAdsComponent', () => {
  let component: UpdateAdsComponent;
  let fixture: ComponentFixture<UpdateAdsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateAdsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateAdsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
