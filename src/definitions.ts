declare module '@capacitor/core' {
  interface PluginRegistry {
    JoannaPlugin: JoannaPluginPlugin;
  }
}

export interface JoannaPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  printSmthOnScreen(message: Message): Promise<Message>;
  displayNotification(jNotification: JNotification): Promise<JNotification>;
}

export interface Message {
  value: string;
  senderName: string;
}

export interface JNotification {
  value: string;
  senderName: string;
}