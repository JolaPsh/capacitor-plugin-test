# joanna-plugin

For test purposes

## Install

```bash
npm install joanna-plugin
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`printSmthOnScreen(...)`](#printsmthonscreen)
* [`displayNotification(...)`](#displaynotification)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### printSmthOnScreen(...)

```typescript
printSmthOnScreen(message: Message) => Promise<Message>
```

| Param         | Type                                        |
| ------------- | ------------------------------------------- |
| **`message`** | <code><a href="#message">Message</a></code> |

**Returns:** <code>Promise&lt;<a href="#message">Message</a>&gt;</code>

--------------------


### displayNotification(...)

```typescript
displayNotification(jNotification: JNotification) => Promise<JNotification>
```

| Param               | Type                                                    |
| ------------------- | ------------------------------------------------------- |
| **`jNotification`** | <code><a href="#jnotification">JNotification</a></code> |

**Returns:** <code>Promise&lt;<a href="#jnotification">JNotification</a>&gt;</code>

--------------------


### Interfaces


#### Message

| Prop             | Type                |
| ---------------- | ------------------- |
| **`value`**      | <code>string</code> |
| **`senderName`** | <code>string</code> |


#### JNotification

| Prop             | Type                |
| ---------------- | ------------------- |
| **`value`**      | <code>string</code> |
| **`senderName`** | <code>string</code> |

</docgen-api>
