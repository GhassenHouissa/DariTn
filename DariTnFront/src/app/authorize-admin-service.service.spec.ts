import { TestBed } from '@angular/core/testing';

import { AuthorizeAdminServiceService } from './authorize-admin-service.service';

describe('AuthorizeAdminServiceService', () => {
  let service: AuthorizeAdminServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthorizeAdminServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
