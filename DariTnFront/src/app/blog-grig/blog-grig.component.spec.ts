import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BlogGrigComponent } from './blog-grig.component';

describe('BlogGrigComponent', () => {
  let component: BlogGrigComponent;
  let fixture: ComponentFixture<BlogGrigComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BlogGrigComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BlogGrigComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
