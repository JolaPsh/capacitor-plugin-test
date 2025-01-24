import { Component } from '@angular/core';
import { JoannaPlugin, Message, JNotification } from 'joanna-plugin';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: false,
})
export class HomePage {

  visible:boolean = false;
  message: any;
  
  constructor() {}

  async displayNotification(jNotification: JNotification) {
    const response = await JoannaPlugin.displayNotification(jNotification)
    .then((res:any) => JSON.stringify(jNotification.value + ', was send by ' + jNotification.senderName));
    alert(response);
  }

  async printSmthOnScreen(message: Message){
    this.visible = !this.visible;
    const response = await JoannaPlugin.printSmthOnScreen(message)
    .then((res:any) => JSON.stringify(message.value + ', was printed by ' + message.senderName));
    this.message = response;
  }
}