import { WebPlugin } from '@capacitor/core';

import type {JoannaPluginPlugin, Message, JNotification} from './definitions';

export class JoannaPluginWeb extends WebPlugin implements JoannaPluginPlugin {

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async displayNotification(jNotification: JNotification): Promise<JNotification> {
    return jNotification;
  }

  async printSmthOnScreen(message: Message): Promise<Message> {
    return message;
  }
}