import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AgentComponentComponent } from './agent-component.component';

describe('AgentComponentComponent', () => {
  let component: AgentComponentComponent;
  let fixture: ComponentFixture<AgentComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AgentComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AgentComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
