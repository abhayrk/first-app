import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {User} from '../models/user';
import {UserService} from './user.service';


@Component({
  templateUrl: './add-user.component.html'
})
export class AddUserComponent implements OnInit {

  user: User = new User();
  
  constructor(private route: Router, private userService: UserService) { }

  ngOnInit() {
  }

  createUser():void {
    this.userService.createUser(this.user)
      .subscribe(data => {
        alert("User added successfully!");
      });
  }
  
}
