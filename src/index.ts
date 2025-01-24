import { registerPlugin } from '@capacitor/core';

import type { JoannaPluginPlugin } from './definitions';

const JoannaPlugin = registerPlugin<JoannaPluginPlugin>('JoannaPlugin', {
  web: () => import('./web').then((m) => new m.JoannaPluginWeb()),
});

export * from './definitions';
export { JoannaPlugin };
