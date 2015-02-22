/*   1:    */ package artowiird;
/*   2:    */ 
/*   3:    */ import java.awt.Dimension;
/*   4:    */ import java.beans.PropertyChangeEvent;
/*   5:    */ import java.beans.PropertyChangeListener;

/*   6:    */ import javax.swing.ActionMap;
/*   7:    */ import javax.swing.GroupLayout;
/*   8:    */ import javax.swing.GroupLayout.Alignment;
/*   9:    */ import javax.swing.GroupLayout.ParallelGroup;
/*  10:    */ import javax.swing.GroupLayout.SequentialGroup;
/*  11:    */ import javax.swing.Icon;
/*  12:    */ import javax.swing.JButton;
/*  13:    */ import javax.swing.JCheckBox;
/*  14:    */ import javax.swing.JDialog;
/*  15:    */ import javax.swing.JFrame;
/*  16:    */ import javax.swing.JLabel;
/*  17:    */ import javax.swing.JPanel;
/*  18:    */ import javax.swing.JScrollPane;
/*  19:    */ import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
/*  20:    */ import javax.swing.LayoutStyle.ComponentPlacement;
/*  21:    */ import javax.swing.Timer;

/*  22:    */ import org.jdesktop.application.Action;
/*  23:    */ import org.jdesktop.application.Application;
/*  24:    */ import org.jdesktop.application.ApplicationContext;
/*  25:    */ import org.jdesktop.application.FrameView;
/*  26:    */ import org.jdesktop.application.ResourceMap;
/*  27:    */ import org.jdesktop.application.SingleFrameApplication;
/*  28:    */ import org.jdesktop.application.TaskMonitor;
/*  29:    */ 
/*  30:    */ public class ARtoWiiRDView
/*  31:    */   extends FrameView
/*  32:    */ {
/*  33:    */   private JButton jButton1;
/*  34:    */   private JButton jButton2;
/*  35:    */   private JButton jButton3;
/*  36:    */   private JCheckBox jCheckBox1;
/*  37:    */   private JLabel jLabel1;
/*  38:    */   private JLabel jLabel2;
/*  39:    */   private JLabel jLabel3;
/*  40:    */   private JScrollPane jScrollPane1;
/*  41:    */   private JScrollPane jScrollPane2;
/*  42:    */   private JTextPane jTextPane1;
/*  43:    */   private JTextPane jTextPane2;
/*  44:    */   private JPanel mainPanel;
/*  45:    */   private final Timer messageTimer;
/*  46:    */   private final Timer busyIconTimer;
/*  47:    */   private final Icon idleIcon;
/*  48:    */   
/*  49:    */   public ARtoWiiRDView(SingleFrameApplication app)
/*  50:    */   {
/*  51: 25 */     super(app);
/*  52:    */     
/*  53: 27 */     initComponents();
/*  54:    */     
/*  55:    */ 
/*  56: 30 */     ResourceMap resourceMap = getResourceMap();
/*  57: 31 */     int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout").intValue();
/*  58: 32 */     this.messageTimer = new Timer(messageTimeout, null);
/*  59: 33 */     this.messageTimer.setRepeats(false);
/*  60: 34 */     int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate").intValue();
/*  61: 35 */     for (int i = 0; i < this.busyIcons.length; i++) {
/*  62: 36 */       this.busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
/*  63:    */     }
/*  64: 38 */     this.busyIconTimer = new Timer(busyAnimationRate, null);
/*  65: 39 */     this.idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
/*  66:    */     
/*  67:    */ 
/*  68: 42 */     TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
/*  69: 43 */     taskMonitor.addPropertyChangeListener(new PropertyChangeListener()
/*  70:    */     {
/*  71:    */       public void propertyChange(PropertyChangeEvent evt)
/*  72:    */       {
/*  73: 45 */         String propertyName = evt.getPropertyName();
/*  74:    */       }
/*  75:    */     });
/*  76:    */   }
/*  77:    */   
/*  78:    */   @Action
/*  79:    */   public void showAboutBox()
/*  80:    */   {
/*  81: 53 */     //if (this.aboutBox == null)
/*  82:    */     //{
/*  83: 54 */     //  JFrame mainFrame = ARtoWiiRDApp.getApplication().getMainFrame();
/*  84: 55 */     //  this.aboutBox = new ARtoWiiRDAboutBox(mainFrame);
/*  85: 56 */     //  this.aboutBox.setLocationRelativeTo(mainFrame);
/*  86:    */     //}
/*  87: 58 */     //ARtoWiiRDApp.getApplication().show(this.aboutBox);
/*  88:    */   }
/*  89:    */   
/*  90:    */   private void initComponents()
/*  91:    */   {
/*  92: 70 */     this.mainPanel = new JPanel();
/*  93: 71 */     this.jLabel1 = new JLabel();
/*  94: 72 */     this.jLabel2 = new JLabel();
/*  95: 73 */     this.jButton1 = new JButton();
/*  96: 74 */     this.jLabel3 = new JLabel();
/*  97: 75 */     this.jScrollPane1 = new JScrollPane();
/*  98: 76 */     this.jTextPane1 = new JTextPane();
/*  99: 77 */     this.jScrollPane2 = new JScrollPane();
/* 100: 78 */     this.jTextPane2 = new JTextPane();
/* 101: 79 */     this.jButton2 = new JButton();
/* 102: 80 */     this.jButton3 = new JButton();
/* 103: 81 */     this.jCheckBox1 = new JCheckBox();
/* 104:    */     
/* 105: 83 */     this.mainPanel.setMaximumSize(new Dimension(507, 485));
/* 106: 84 */     this.mainPanel.setMinimumSize(new Dimension(507, 485));
/* 107: 85 */     this.mainPanel.setSize(507, 485);
/* 108: 86 */     this.mainPanel.setName("mainPanel");
/* 109:    */     
/* 110: 88 */     ResourceMap resourceMap = ((ARtoWiiRDApp)Application.getInstance(ARtoWiiRDApp.class)).getContext().getResourceMap(ARtoWiiRDView.class);
/* 111: 89 */     this.jLabel1.setText(resourceMap.getString("jLabel1.text", new Object[0]));
/* 112: 90 */     this.jLabel1.setName("jLabel1");
/* 113:    */     
/* 114: 92 */     this.jLabel2.setText(resourceMap.getString("jLabel2.text", new Object[0]));
/* 115: 93 */     this.jLabel2.setName("jLabel2");
/* 116:    */     
/* 117: 95 */     ActionMap actionMap = ((ARtoWiiRDApp)Application.getInstance(ARtoWiiRDApp.class)).getContext().getActionMap(ARtoWiiRDView.class, this);
/* 118: 96 */     this.jButton1.setAction(actionMap.get("Convert"));
/* 119: 97 */     this.jButton1.setText(resourceMap.getString("jButton1.text", new Object[0]));
/* 120: 98 */     this.jButton1.setName("jButton1");
/* 121:    */     
/* 122:100 */     this.jLabel3.setText(resourceMap.getString("jLabel3.text", new Object[0]));
/* 123:101 */     this.jLabel3.setName("jLabel3");
/* 124:    */     
/* 125:103 */     this.jScrollPane1.setMaximumSize(new Dimension(237, 407));
/* 126:104 */     this.jScrollPane1.setMinimumSize(new Dimension(237, 407));
/* 127:105 */     this.jScrollPane1.setName("jScrollPane1");
/* 128:106 */     this.jScrollPane1.setPreferredSize(new Dimension(237, 407));
/* 129:    */     
/* 130:108 */     this.jTextPane1.setFont(resourceMap.getFont("GCNCodes.font"));
/* 131:109 */     this.jTextPane1.setName("GCNCodes");
/* 132:110 */     this.jTextPane1.setPreferredSize(new Dimension(237, 407));
/* 133:111 */     this.jScrollPane1.setViewportView(this.jTextPane1);
/* 134:    */     
/* 135:113 */     this.jScrollPane2.setName("jScrollPane2");
/* 136:114 */     this.jScrollPane2.setPreferredSize(new Dimension(237, 407));
/* 137:    */     
/* 138:116 */     this.jTextPane2.setEditable(false);
/* 139:117 */     this.jTextPane2.setFont(resourceMap.getFont("WiiRDCodes.font"));
/* 140:118 */     this.jTextPane2.setName("WiiRDCodes");
/* 141:119 */     this.jScrollPane2.setViewportView(this.jTextPane2);
/* 142:    */     
/* 143:121 */     this.jButton2.setAction(actionMap.get("clearwiird"));
/* 144:122 */     this.jButton2.setText(resourceMap.getString("jButton2.text", new Object[0]));
/* 145:123 */     this.jButton2.setName("jButton2");
/* 146:    */     
/* 147:125 */     this.jButton3.setAction(actionMap.get("cleargcn"));
/* 148:126 */     this.jButton3.setName("jButton3");
/* 149:    */     
/* 150:128 */     this.jCheckBox1.setText(resourceMap.getString("jCheckBox1.text", new Object[0]));
/* 151:129 */     this.jCheckBox1.setName("jCheckBox1");
/* 152:    */     
/* 153:131 */     GroupLayout mainPanelLayout = new GroupLayout(this.mainPanel);
/* 154:132 */     this.mainPanel.setLayout(mainPanelLayout);
/* 155:133 */     mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(mainPanelLayout.createSequentialGroup().addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(mainPanelLayout.createSequentialGroup().addComponent(this.jScrollPane1, -2, 237, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGroup(mainPanelLayout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton3).addGap(25, 25, 25))).addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane2, -2, -1, -2).addGroup(mainPanelLayout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2).addGap(22, 22, 22)))).addGroup(mainPanelLayout.createSequentialGroup().addComponent(this.jCheckBox1).addGap(7, 7, 7).addComponent(this.jButton1, -2, 150, -2).addGap(18, 18, 18).addComponent(this.jLabel3))).addContainerGap(17, 32767)));
/* 156:    */     
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:163 */     mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(mainPanelLayout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 407, -2)).addGroup(mainPanelLayout.createSequentialGroup().addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jButton2).addComponent(this.jButton3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 25, -2).addComponent(this.jLabel3).addComponent(this.jCheckBox1)).addContainerGap(-1, 32767)));
/* 186:    */     
/* 187:    */ 
/* 188:    */ 
/* 189:    */ 
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:    */ 
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:    */ 
/* 207:    */ 
/* 208:    */ 
/* 209:187 */     setComponent(this.mainPanel);
/* 210:    */   }
/* 211:    */   
/* 212:    */   @Action
/* 213:    */   public void Convert()
/* 214:    */   {
/* 215:192 */     this.jTextPane2.setText("REMEMBER: When you Convert\r\nthese codes YOU DO NOT GET\r\nCREDIT FOR THE CODE, it's \r\nthe EXACT SAME CODE that it\r\nwas for GameCube AR which a\r\nhacker spent his/her time \r\non creating!!\r\n");
/* 216:    */     
/* 217:    */ 
/* 218:    */ 
/* 219:    */ 
/* 220:    */ 
/* 221:    */ 
/* 222:199 */     String GCNCodes = this.jTextPane1.getText();
/* 223:200 */     GCNCodes = GCNCodes + "\r\n";
/* 224:201 */     String line = "";
/* 225:202 */     int length = GCNCodes.length();
/* 226:203 */     int numlines = 0;
/* 227:204 */     for (int x = 0; x < length; x++) {
/* 228:206 */       if (GCNCodes.substring(x, x + 1).equals("\n")) {
/* 229:208 */         numlines++;
/* 230:    */       }
/* 231:    */     }
/* 232:211 */     int EndConditional = -1;
/* 233:212 */     int i = -1;
/* 234:213 */     int pos = 0;
/* 235:214 */     int pos2 = -1;
/* 236:215 */     boolean LastWasCode = false;
/* 237:216 */     boolean IsChecked = this.jCheckBox1.isSelected();
/* 238:    */     do
/* 239:    */     {
/* 240:219 */       i++;
/* 241:220 */       if (i > numlines) {
/* 242:    */         break;
/* 243:    */       }
/* 244:222 */       pos = pos2 + 1;
/* 245:223 */       pos2 = GCNCodes.indexOf("\n", pos);
/* 246:224 */       if (pos2 < 0) {
/* 247:225 */         pos2 = length;
/* 248:    */       }
/* 249:226 */       line = GCNCodes.substring(pos, pos2).trim();
/* 250:227 */       char[] charline = line.toCharArray();
/* 251:229 */       if (i == EndConditional) {
/* 252:230 */         this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 253:    */       }
/* 254:232 */       boolean code = false;
/* 255:233 */       if (line.length() == 17)
/* 256:    */       {
/* 257:235 */         code = true;
/* 258:236 */         for (int x = 0; x < 8; x++)
/* 259:    */         {
/* 260:238 */           char c = charline[x];
/* 261:239 */           if (((c < 'a') || (c > 'f')) && 
/* 262:240 */             ((c < 'A') || (c > 'F')) && (
/* 263:241 */             (c < '0') || (c > '9')))
/* 264:    */           {
/* 265:242 */             code = false;
/* 266:243 */             break;
/* 267:    */           }
/* 268:    */         }
/* 269:245 */         if ((code) && (charline[8] == ' ')) {
/* 270:247 */           for (int x = 9; x < 17; x++)
/* 271:    */           {
/* 272:249 */             char c = charline[x];
/* 273:250 */             if (((c < 'a') || (c > 'f')) && 
/* 274:251 */               ((c < 'A') || (c > 'F')) && (
/* 275:252 */               (c < '0') || (c > '9')))
/* 276:    */             {
/* 277:253 */               code = false;
/* 278:254 */               break;
/* 279:    */             }
/* 280:    */           }
/* 281:    */         } else {
/* 282:258 */           code = false;
/* 283:    */         }
/* 284:    */       }
/* 285:260 */       if (code)
/* 286:    */       {
/* 287:262 */         if ((!LastWasCode) && (IsChecked))
/* 288:    */         {
/* 289:264 */           LastWasCode = true;
/* 290:    */         }
/* 291:    */         else
/* 292:    */         {
/* 293:267 */           line = line.toUpperCase();
/* 294:268 */           charline = line.toCharArray();
/* 295:269 */           if ((charline[0] != 'C') || ((charline[1] != '4') && (charline[1] != '5') && (charline[1] != '6') && (charline[1] != '0') && (charline[1] != '2'))) {
/* 296:271 */             if (charline[0] == '0')
/* 297:    */             {
/* 298:273 */               if (line.equals("00000000 40000000"))
/* 299:    */               {
/* 300:275 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "E0000000 80008000\r\n");
/* 301:    */               }
/* 302:277 */               else if (line.equals("00000000 00000000"))
/* 303:    */               {
/* 304:279 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "F0000000 00000000\r\n");
/* 305:    */               }
/* 306:281 */               else if (line.equals("00000000 60000000"))
/* 307:    */               {
/* 308:283 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "no convert for rigorous code handling\r\n");
/* 309:    */               }
/* 310:285 */               else if (line.startsWith("00000000 8"))
/* 311:    */               {
/* 312:287 */                 i++;
/* 313:288 */                 pos = pos2 + 1;
/* 314:289 */                 pos2 = GCNCodes.indexOf("\n", pos);
/* 315:290 */                 if (pos2 < 0) {
/* 316:291 */                   pos2 = length;
/* 317:    */                 }
/* 318:    */                 String line2;
/* 319:    */                 //String line2;
/* 320:293 */                 if (i >= numlines) {
/* 321:294 */                   line2 = "GCN CODE !!ERROR!";
/* 322:    */                 } else {
/* 323:296 */                   line2 = GCNCodes.substring(pos, pos2).trim();
/* 324:    */                 }
/* 325:297 */                 if (line2.length() != 17) {
/* 326:298 */                   line2 = "GCN CODE !!ERROR2";
/* 327:    */                 }
/* 328:299 */                 if ((charline[10] == '0') || (charline[10] == '2') || (charline[10] == '4')) {
/* 329:300 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "08");
/* 330:    */                 } else {
/* 331:302 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "09");
/* 332:    */                 }
/* 333:303 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line.substring(11, 17));
/* 334:304 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " " + line2.substring(0, 8) + "\r\n");
/* 335:305 */                 if ((charline[10] == '0') || (charline[10] == '1')) {
/* 336:306 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "00");
/* 337:307 */                 } else if ((charline[10] == '2') || (charline[10] == '3')) {
/* 338:308 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "10");
/* 339:309 */                 } else if ((charline[10] == '4') || (charline[10] == '5')) {
/* 340:310 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "20");
/* 341:    */                 }
/* 342:311 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line2.substring(11, 13) + line2.substring(13, 17) + " 000000" + line2.substring(9, 11) + "\r\n");
/* 343:    */               }
/* 344:313 */               else if ((charline[1] == '0') || (charline[1] == '1'))
/* 345:    */               {
/* 346:317 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line.substring(0, 9) + line.substring(11, 15) + "00" + line.substring(15, 17) + "\r\n");
/* 347:    */               }
/* 348:319 */               else if ((charline[1] == '2') || (charline[1] == '3') || (charline[1] == '4') || (charline[1] == '5'))
/* 349:    */               {
/* 350:321 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line + "\r\n");
/* 351:    */               }
/* 352:323 */               else if (charline[1] == 'A')
/* 353:    */               {
/* 354:325 */                 EndConditional = i + 2;
/* 355:326 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "28" + line.substring(2) + "\r\n");
/* 356:    */               }
/* 357:328 */               else if (charline[1] == 'B')
/* 358:    */               {
/* 359:330 */                 EndConditional = i + 2;
/* 360:331 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "29" + line.substring(2) + "\r\n");
/* 361:    */               }
/* 362:333 */               else if (charline[1] == 'C')
/* 363:    */               {
/* 364:335 */                 EndConditional = i + 2;
/* 365:336 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "20" + line.substring(2) + "\r\n");
/* 366:    */               }
/* 367:338 */               else if (charline[1] == 'D')
/* 368:    */               {
/* 369:340 */                 EndConditional = i + 2;
/* 370:341 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "21" + line.substring(2) + "\r\n");
/* 371:    */               }
/* 372:343 */               else if ((charline[1] == '8') || (charline[1] == '9'))
/* 373:    */               {
/* 374:345 */                 EndConditional = i + 2;
/* 375:346 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2" + line.substring(1, 7));
/* 376:347 */                 if (charline[7] == '1') {
/* 377:348 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 378:349 */                 } else if (charline[7] == '3') {
/* 379:350 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 380:351 */                 } else if (charline[7] == '5') {
/* 381:352 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 382:353 */                 } else if (charline[7] == '7') {
/* 383:354 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 384:355 */                 } else if (charline[7] == '9') {
/* 385:356 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 386:357 */                 } else if (charline[7] == 'B') {
/* 387:358 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 388:359 */                 } else if (charline[7] == 'D') {
/* 389:360 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 390:361 */                 } else if (charline[7] == 'F') {
/* 391:362 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 392:    */                 } else {
/* 393:364 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 394:    */                 }
/* 395:365 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 396:    */               }
/* 397:    */             }
/* 398:368 */             else if ((charline[0] == '1') || (charline[0] == '5') || (charline[0] == '9') || (charline[0] == 'D'))
/* 399:    */             {
/* 400:370 */               if (charline[1] == '2')
/* 401:    */               {
/* 402:372 */                 if (charline[0] == '1') {
/* 403:373 */                   EndConditional = i + 2;
/* 404:374 */                 } else if (charline[0] == '5') {
/* 405:375 */                   EndConditional = i + 3;
/* 406:    */                 }
/* 407:376 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2A" + line.substring(2) + "\r\n");
/* 408:    */               }
/* 409:378 */               else if (charline[1] == '3')
/* 410:    */               {
/* 411:380 */                 if (charline[0] == '1') {
/* 412:381 */                   EndConditional = i + 2;
/* 413:382 */                 } else if (charline[0] == '5') {
/* 414:383 */                   EndConditional = i + 3;
/* 415:    */                 }
/* 416:384 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2B" + line.substring(2) + "\r\n");
/* 417:    */               }
/* 418:386 */               else if (charline[1] == '4')
/* 419:    */               {
/* 420:388 */                 if (charline[0] == '1') {
/* 421:389 */                   EndConditional = i + 2;
/* 422:390 */                 } else if (charline[0] == '5') {
/* 423:391 */                   EndConditional = i + 3;
/* 424:    */                 }
/* 425:392 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "22" + line.substring(2) + "\r\n");
/* 426:    */               }
/* 427:394 */               else if (charline[1] == '5')
/* 428:    */               {
/* 429:396 */                 if (charline[0] == '1') {
/* 430:397 */                   EndConditional = i + 2;
/* 431:398 */                 } else if (charline[0] == '5') {
/* 432:399 */                   EndConditional = i + 3;
/* 433:    */                 }
/* 434:400 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "23" + line.substring(2) + "\r\n");
/* 435:    */               }
/* 436:402 */               else if (charline[1] == '0')
/* 437:    */               {
/* 438:404 */                 if (charline[0] == '1') {
/* 439:405 */                   EndConditional = i + 2;
/* 440:406 */                 } else if (charline[0] == '5') {
/* 441:407 */                   EndConditional = i + 3;
/* 442:    */                 }
/* 443:408 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2A" + line.substring(2, 7));
/* 444:409 */                 if (charline[7] == '1') {
/* 445:410 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 446:411 */                 } else if (charline[7] == '3') {
/* 447:412 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 448:413 */                 } else if (charline[7] == '5') {
/* 449:414 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 450:415 */                 } else if (charline[7] == '7') {
/* 451:416 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 452:417 */                 } else if (charline[7] == '9') {
/* 453:418 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 454:419 */                 } else if (charline[7] == 'B') {
/* 455:420 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 456:421 */                 } else if (charline[7] == 'D') {
/* 457:422 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 458:423 */                 } else if (charline[7] == 'F') {
/* 459:424 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 460:    */                 } else {
/* 461:426 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 462:    */                 }
/* 463:427 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 464:    */               }
/* 465:429 */               else if (charline[1] == '1')
/* 466:    */               {
/* 467:431 */                 if (charline[0] == '1') {
/* 468:432 */                   EndConditional = i + 2;
/* 469:433 */                 } else if (charline[0] == '5') {
/* 470:434 */                   EndConditional = i + 3;
/* 471:    */                 }
/* 472:435 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2B" + line.substring(2, 7));
/* 473:436 */                 if (charline[7] == '1') {
/* 474:437 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 475:438 */                 } else if (charline[7] == '3') {
/* 476:439 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 477:440 */                 } else if (charline[7] == '5') {
/* 478:441 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 479:442 */                 } else if (charline[7] == '7') {
/* 480:443 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 481:444 */                 } else if (charline[7] == '9') {
/* 482:445 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 483:446 */                 } else if (charline[7] == 'B') {
/* 484:447 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 485:448 */                 } else if (charline[7] == 'D') {
/* 486:449 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 487:450 */                 } else if (charline[7] == 'F') {
/* 488:451 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 489:    */                 } else {
/* 490:453 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 491:    */                 }
/* 492:454 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 493:    */               }
/* 494:456 */               else if ((charline[1] == 'A') || (charline[1] == 'B'))
/* 495:    */               {
/* 496:458 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 16bit signed lower next line.\r\n");
/* 497:    */               }
/* 498:460 */               else if (charline[1] == 'C')
/* 499:    */               {
/* 500:462 */                 if (charline[0] == '1') {
/* 501:463 */                   EndConditional = i + 2;
/* 502:464 */                 } else if (charline[0] == '5') {
/* 503:465 */                   EndConditional = i + 3;
/* 504:    */                 }
/* 505:466 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "26" + line.substring(2) + "\r\n");
/* 506:    */               }
/* 507:468 */               else if (charline[1] == 'D')
/* 508:    */               {
/* 509:470 */                 if (charline[0] == '1') {
/* 510:471 */                   EndConditional = i + 2;
/* 511:472 */                 } else if (charline[0] == '5') {
/* 512:473 */                   EndConditional = i + 3;
/* 513:    */                 }
/* 514:474 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "27" + line.substring(2) + "\r\n");
/* 515:    */               }
/* 516:476 */               else if ((charline[1] == '8') || (charline[1] == '9'))
/* 517:    */               {
/* 518:478 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 8bit signed lower next line.\r\n");
/* 519:    */               }
/* 520:    */             }
/* 521:481 */             else if ((charline[0] == '2') || (charline[0] == '6') || (charline[0] == 'A') || (charline[0] == 'E'))
/* 522:    */             {
/* 523:483 */               if ((charline[1] == '2') || (charline[1] == '3'))
/* 524:    */               {
/* 525:485 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 16bit signed greater next line.\r\n");
/* 526:    */               }
/* 527:487 */               else if ((charline[1] == '4') || (charline[1] == '5'))
/* 528:    */               {
/* 529:489 */                 if (charline[0] == '2') {
/* 530:490 */                   EndConditional = i + 2;
/* 531:491 */                 } else if (charline[0] == '6') {
/* 532:492 */                   EndConditional = i + 3;
/* 533:    */                 }
/* 534:493 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line + "\r\n");
/* 535:    */               }
/* 536:495 */               else if ((charline[1] == '0') || (charline[1] == '1'))
/* 537:    */               {
/* 538:497 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 8bit signed greater next line.\r\n");
/* 539:    */               }
/* 540:499 */               else if (charline[1] == 'A')
/* 541:    */               {
/* 542:501 */                 if (charline[0] == '2') {
/* 543:502 */                   EndConditional = i + 2;
/* 544:503 */                 } else if (charline[0] == '6') {
/* 545:504 */                   EndConditional = i + 3;
/* 546:    */                 }
/* 547:505 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2E" + line.substring(2) + "\r\n");
/* 548:    */               }
/* 549:507 */               else if (charline[1] == 'B')
/* 550:    */               {
/* 551:509 */                 if (charline[0] == '2') {
/* 552:510 */                   EndConditional = i + 2;
/* 553:511 */                 } else if (charline[0] == '6') {
/* 554:512 */                   EndConditional = i + 3;
/* 555:    */                 }
/* 556:513 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2F" + line.substring(2) + "\r\n");
/* 557:    */               }
/* 558:515 */               else if ((charline[1] == '4') || (charline[1] == '5'))
/* 559:    */               {
/* 560:517 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 32bit unsigned lower next line.\r\n");
/* 561:    */               }
/* 562:519 */               else if (charline[1] == '8')
/* 563:    */               {
/* 564:521 */                 if (charline[0] == '2') {
/* 565:522 */                   EndConditional = i + 2;
/* 566:523 */                 } else if (charline[0] == '6') {
/* 567:524 */                   EndConditional = i + 3;
/* 568:    */                 }
/* 569:525 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2E" + line.substring(2, 7));
/* 570:526 */                 if (charline[7] == '1') {
/* 571:527 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 572:528 */                 } else if (charline[7] == '3') {
/* 573:529 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 574:530 */                 } else if (charline[7] == '5') {
/* 575:531 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 576:532 */                 } else if (charline[7] == '7') {
/* 577:533 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 578:534 */                 } else if (charline[7] == '9') {
/* 579:535 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 580:536 */                 } else if (charline[7] == 'B') {
/* 581:537 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 582:538 */                 } else if (charline[7] == 'D') {
/* 583:539 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 584:540 */                 } else if (charline[7] == 'F') {
/* 585:541 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 586:    */                 } else {
/* 587:543 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 588:    */                 }
/* 589:544 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 590:    */               }
/* 591:546 */               else if (charline[1] == '9')
/* 592:    */               {
/* 593:548 */                 if (charline[0] == '2') {
/* 594:549 */                   EndConditional = i + 2;
/* 595:550 */                 } else if (charline[0] == '6') {
/* 596:551 */                   EndConditional = i + 3;
/* 597:    */                 }
/* 598:552 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2F" + line.substring(2, 7));
/* 599:553 */                 if (charline[7] == '1') {
/* 600:554 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 601:555 */                 } else if (charline[7] == '3') {
/* 602:556 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 603:557 */                 } else if (charline[7] == '5') {
/* 604:558 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 605:559 */                 } else if (charline[7] == '7') {
/* 606:560 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 607:561 */                 } else if (charline[7] == '9') {
/* 608:562 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 609:563 */                 } else if (charline[7] == 'B') {
/* 610:564 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 611:565 */                 } else if (charline[7] == 'D') {
/* 612:566 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 613:567 */                 } else if (charline[7] == 'F') {
/* 614:568 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 615:    */                 } else {
/* 616:570 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 617:    */                 }
/* 618:571 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 619:    */               }
/* 620:    */             }
/* 621:574 */             else if ((charline[0] == '3') || (charline[0] == '7') || (charline[0] == 'B') || (charline[0] == 'F'))
/* 622:    */             {
/* 623:576 */               if (charline[1] == '2')
/* 624:    */               {
/* 625:578 */                 if (charline[0] == '3') {
/* 626:579 */                   EndConditional = i + 2;
/* 627:580 */                 } else if (charline[0] == '7') {
/* 628:581 */                   EndConditional = i + 3;
/* 629:    */                 }
/* 630:582 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2C" + line.substring(2) + "\r\n");
/* 631:    */               }
/* 632:584 */               else if (charline[1] == '3')
/* 633:    */               {
/* 634:586 */                 if (charline[0] == '3') {
/* 635:587 */                   EndConditional = i + 2;
/* 636:588 */                 } else if (charline[0] == '7') {
/* 637:589 */                   EndConditional = i + 3;
/* 638:    */                 }
/* 639:590 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2D" + line.substring(2) + "\r\n");
/* 640:    */               }
/* 641:592 */               else if ((charline[1] == '4') || (charline[1] == '5'))
/* 642:    */               {
/* 643:594 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 32bit unsigned greater next line.\r\n");
/* 644:    */               }
/* 645:596 */               else if (charline[1] == '0')
/* 646:    */               {
/* 647:598 */                 if (charline[0] == '3') {
/* 648:599 */                   EndConditional = i + 2;
/* 649:600 */                 } else if (charline[0] == '7') {
/* 650:601 */                   EndConditional = i + 3;
/* 651:    */                 }
/* 652:602 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2C" + line.substring(2, 7));
/* 653:603 */                 if (charline[7] == '1') {
/* 654:604 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 655:605 */                 } else if (charline[7] == '3') {
/* 656:606 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 657:607 */                 } else if (charline[7] == '5') {
/* 658:608 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 659:609 */                 } else if (charline[7] == '7') {
/* 660:610 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 661:611 */                 } else if (charline[7] == '9') {
/* 662:612 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 663:613 */                 } else if (charline[7] == 'B') {
/* 664:614 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 665:615 */                 } else if (charline[7] == 'D') {
/* 666:616 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 667:617 */                 } else if (charline[7] == 'F') {
/* 668:618 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 669:    */                 } else {
/* 670:620 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 671:    */                 }
/* 672:621 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 673:    */               }
/* 674:623 */               else if (charline[1] == '1')
/* 675:    */               {
/* 676:625 */                 if (charline[0] == '3') {
/* 677:626 */                   EndConditional = i + 2;
/* 678:627 */                 } else if (charline[0] == '7') {
/* 679:628 */                   EndConditional = i + 3;
/* 680:    */                 }
/* 681:629 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2D" + line.substring(2, 7));
/* 682:630 */                 if (charline[7] == '1') {
/* 683:631 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 684:632 */                 } else if (charline[7] == '3') {
/* 685:633 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 686:634 */                 } else if (charline[7] == '5') {
/* 687:635 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 688:636 */                 } else if (charline[7] == '7') {
/* 689:637 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 690:638 */                 } else if (charline[7] == '9') {
/* 691:639 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 692:640 */                 } else if (charline[7] == 'B') {
/* 693:641 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 694:642 */                 } else if (charline[7] == 'D') {
/* 695:643 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 696:644 */                 } else if (charline[7] == 'F') {
/* 697:645 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 698:    */                 } else {
/* 699:647 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 700:    */                 }
/* 701:648 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 702:    */               }
/* 703:650 */               else if (charline[1] == 'A')
/* 704:    */               {
/* 705:652 */                 if (charline[0] == '3') {
/* 706:653 */                   EndConditional = i + 2;
/* 707:654 */                 } else if (charline[0] == '7') {
/* 708:655 */                   EndConditional = i + 3;
/* 709:    */                 }
/* 710:656 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "28" + line.substring(2, 9));
/* 711:    */                 
/* 712:658 */                 int[] part = new int[4];
/* 713:659 */                 part[0] = (charline[13] + '\000');
/* 714:660 */                 part[1] = (charline[14] + '\000');
/* 715:661 */                 part[2] = (charline[15] + '\000');
/* 716:662 */                 part[3] = (charline[16] + '\000');
/* 717:663 */                 for (int bob = 0; bob < 4; bob++)
/* 718:    */                 {
/* 719:665 */                   if ((part[bob] > 47) && (part[bob] < 59)) {
/* 720:666 */                     part[bob] -= 48;
/* 721:    */                   }
/* 722:667 */                   if ((part[bob] > 96) && (part[bob] < 103)) {
/* 723:668 */                     part[bob] -= 32;
/* 724:    */                   }
/* 725:669 */                   if ((part[bob] > 64) && (part[bob] < 71)) {
/* 726:670 */                     part[bob] -= 55;
/* 727:    */                   }
/* 728:    */                 }
/* 729:672 */                 int hex = 4096 * part[0] + 256 * part[1] + 16 * part[2] + 1 * part[3];
/* 730:673 */                 hex ^= 0xFFFFFFFF;
/* 731:674 */                 this.jTextPane2.setText(this.jTextPane2.getText() + Integer.toHexString(hex).substring(4).toUpperCase());
/* 732:675 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line.substring(13) + "\r\n");
/* 733:    */               }
/* 734:677 */               else if (charline[1] == 'B')
/* 735:    */               {
/* 736:679 */                 if (charline[0] == '3') {
/* 737:680 */                   EndConditional = i + 2;
/* 738:681 */                 } else if (charline[0] == '7') {
/* 739:682 */                   EndConditional = i + 3;
/* 740:    */                 }
/* 741:683 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "29" + line.substring(2, 9));
/* 742:    */                 
/* 743:685 */                 int[] part = new int[4];
/* 744:686 */                 part[0] = (charline[13] + '\000');
/* 745:687 */                 part[1] = (charline[14] + '\000');
/* 746:688 */                 part[2] = (charline[15] + '\000');
/* 747:689 */                 part[3] = (charline[16] + '\000');
/* 748:690 */                 for (int bob = 0; bob < 4; bob++)
/* 749:    */                 {
/* 750:692 */                   if ((part[bob] > 47) && (part[bob] < 59)) {
/* 751:693 */                     part[bob] -= 48;
/* 752:    */                   }
/* 753:694 */                   if ((part[bob] > 96) && (part[bob] < 103)) {
/* 754:695 */                     part[bob] -= 32;
/* 755:    */                   }
/* 756:696 */                   if ((part[bob] > 64) && (part[bob] < 71)) {
/* 757:697 */                     part[bob] -= 55;
/* 758:    */                   }
/* 759:    */                 }
/* 760:699 */                 int hex = 4096 * part[0] + 256 * part[1] + 16 * part[2] + 1 * part[3];
/* 761:700 */                 hex ^= 0xFFFFFFFF;
/* 762:701 */                 this.jTextPane2.setText(this.jTextPane2.getText() + Integer.toHexString(hex).substring(4).toUpperCase());
/* 763:702 */                 this.jTextPane2.setText(this.jTextPane2.getText() + line.substring(13) + "\r\n");
/* 764:    */               }
/* 765:704 */               else if ((charline[1] == 'C') || (charline[1] == 'D'))
/* 766:    */               {
/* 767:706 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "No WiiRD CodeType for GCN AR CodeType- 32bit equal bitwise next line.\r\n");
/* 768:    */               }
/* 769:708 */               else if ((charline[1] == '8') || (charline[1] == '9'))
/* 770:    */               {
/* 771:710 */                 if (charline[0] == '3') {
/* 772:711 */                   EndConditional = i + 2;
/* 773:712 */                 } else if (charline[0] == '7') {
/* 774:713 */                   EndConditional = i + 3;
/* 775:    */                 }
/* 776:714 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2" + line.substring(1, 7));
/* 777:715 */                 if (charline[7] == '1') {
/* 778:716 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 779:717 */                 } else if (charline[7] == '3') {
/* 780:718 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 781:719 */                 } else if (charline[7] == '5') {
/* 782:720 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 783:721 */                 } else if (charline[7] == '7') {
/* 784:722 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 785:723 */                 } else if (charline[7] == '9') {
/* 786:724 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 787:725 */                 } else if (charline[7] == 'B') {
/* 788:726 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 789:727 */                 } else if (charline[7] == 'D') {
/* 790:728 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 791:729 */                 } else if (charline[7] == 'F') {
/* 792:730 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 793:    */                 } else {
/* 794:732 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 795:    */                 }
/* 796:733 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " ");
/* 797:    */                 
/* 798:735 */                 int[] part = new int[4];
/* 799:736 */                 part[0] = 0;
/* 800:737 */                 part[1] = 0;
/* 801:738 */                 part[2] = (charline[15] + '\000');
/* 802:739 */                 part[3] = (charline[16] + '\000');
/* 803:740 */                 for (int bob = 0; bob < 4; bob++)
/* 804:    */                 {
/* 805:742 */                   if ((part[bob] > 47) && (part[bob] < 59)) {
/* 806:743 */                     part[bob] -= 48;
/* 807:    */                   }
/* 808:744 */                   if ((part[bob] > 96) && (part[bob] < 103)) {
/* 809:745 */                     part[bob] -= 32;
/* 810:    */                   }
/* 811:746 */                   if ((part[bob] > 64) && (part[bob] < 71)) {
/* 812:747 */                     part[bob] -= 55;
/* 813:    */                   }
/* 814:    */                 }
/* 815:749 */                 int hex = 4096 * part[0] + 256 * part[1] + 16 * part[2] + 1 * part[3];
/* 816:750 */                 hex ^= 0xFFFFFFFF;
/* 817:751 */                 this.jTextPane2.setText(this.jTextPane2.getText() + Integer.toHexString(hex).substring(4).toUpperCase());
/* 818:752 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "00" + line.substring(15) + "\r\n");
/* 819:    */               }
/* 820:    */             }
/* 821:755 */             else if ((charline[0] == '4') || (charline[0] == '8') || (charline[0] == 'C')) {
/* 822:757 */               if ((charline[0] == '4') && ((charline[1] == '0') || (charline[1] == '1')))
/* 823:    */               {
/* 824:759 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "48000000 8" + line.substring(1, 8) + "\r\n");
/* 825:760 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "DE000000 80008180\r\n");
/* 826:761 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "10" + line.substring(9, 15) + " 000000" + line.substring(15) + "\r\n");
/* 827:762 */                 if (EndConditional == i + 1)
/* 828:    */                 {
/* 829:764 */                   EndConditional = i;
/* 830:765 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000002 80008000\r\n");
/* 831:    */                 }
/* 832:    */                 else
/* 833:    */                 {
/* 834:768 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 835:    */                 }
/* 836:    */               }
/* 837:770 */               else if ((charline[0] == '8') && (charline[1] >= '0') && (charline[1] <= '5'))
/* 838:    */               {
/* 839:772 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "Increment is not fully implemented yet.\r\n");
/* 840:    */               }
							else if ((charline[0] == '8') && (charline[1] >= '6') && (charline[1] <= '7'))
							{
								this.jTextPane2.setText(this.jTextPane2.getText() + "80000000 8" + (char)(charline[1] - '6' + '0') + line.substring(2, 8) + "\r\n");
								this.jTextPane2.setText(this.jTextPane2.getText() + "86910000 " + line.substring(9, 17) + "\r\n");
							}
/* 841:774 */               else if ((charline[1] == '2') || (charline[1] == '3'))
/* 842:    */               {
/* 843:776 */                 if (charline[1] == '2') {
/* 844:777 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "48000000 80" + line.substring(2, 8) + "\r\n");
/* 845:    */                 } else {
/* 846:779 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "48000000 81" + line.substring(2, 8) + "\r\n");
/* 847:    */                 }
/* 848:780 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "DE000000 80008180\r\n");
/* 849:781 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "12");
/* 850:    */                 
/* 851:783 */                 int[] part = new int[4];
/* 852:784 */                 part[0] = (charline[9] + '\000');
/* 853:785 */                 part[1] = (charline[10] + '\000');
/* 854:786 */                 part[2] = (charline[11] + '\000');
/* 855:787 */                 part[3] = (charline[12] + '\000');
/* 856:788 */                 for (int bob = 0; bob < 4; bob++)
/* 857:    */                 {
/* 858:790 */                   if ((part[bob] > 47) && (part[bob] < 59)) {
/* 859:791 */                     part[bob] -= 48;
/* 860:    */                   }
/* 861:792 */                   if ((part[bob] > 96) && (part[bob] < 103)) {
/* 862:793 */                     part[bob] -= 32;
/* 863:    */                   }
/* 864:794 */                   if ((part[bob] > 64) && (part[bob] < 71)) {
/* 865:795 */                     part[bob] -= 55;
/* 866:    */                   }
/* 867:    */                 }
/* 868:797 */                 int hex = 4096 * part[0] + 256 * part[1] + 16 * part[2] + 1 * part[3];
/* 869:798 */                 this.jTextPane2.setText(this.jTextPane2.getText() + Integer.toHexString(hex * 2 + 268435456).substring(2).toUpperCase());
/* 870:799 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " 0000" + line.substring(13) + "\r\n");
/* 871:800 */                 if (EndConditional == i + 1)
/* 872:    */                 {
/* 873:802 */                   EndConditional = i;
/* 874:803 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000002 80008000\r\n");
/* 875:    */                 }
/* 876:    */                 else
/* 877:    */                 {
/* 878:806 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 879:    */                 }
/* 880:    */               }
/* 881:808 */               else if (charline[1] == '4')
/* 882:    */               {
/* 883:810 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "48000000 80" + line.substring(2, 8) + "\r\n");
/* 884:811 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "DE000000 80008180\r\n");
/* 885:812 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "14000000 " + line.substring(9) + "\r\n");
/* 886:813 */                 if (EndConditional == i + 1)
/* 887:    */                 {
/* 888:815 */                   EndConditional = i;
/* 889:816 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000002 80008000\r\n");
/* 890:    */                 }
/* 891:    */                 else
/* 892:    */                 {
/* 893:819 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 894:    */                 }
/* 895:    */               }
/* 896:821 */               else if (charline[1] == '5')
/* 897:    */               {
/* 898:823 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "48000000 81" + line.substring(2, 8) + "\r\n");
/* 899:824 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "DE000000 80008180\r\n");
/* 900:825 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "14000000 " + line.substring(9) + "\r\n");
/* 901:826 */                 if (EndConditional == i + 1)
/* 902:    */                 {
/* 903:828 */                   EndConditional = i;
/* 904:829 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000002 80008000\r\n");
/* 905:    */                 }
/* 906:    */                 else
/* 907:    */                 {
/* 908:832 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 909:    */                 }
/* 910:    */               }
/* 911:834 */               else if (charline[1] == 'A')
/* 912:    */               {
/* 913:836 */                 if (charline[0] == '4') {
/* 914:837 */                   EndConditional = i + 3;
/* 915:    */                 }
/* 916:838 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "28" + line.substring(2) + "\r\n");
/* 917:    */               }
/* 918:840 */               else if (charline[1] == 'B')
/* 919:    */               {
/* 920:842 */                 if (charline[0] == '4') {
/* 921:843 */                   EndConditional = i + 3;
/* 922:    */                 }
/* 923:844 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "29" + line.substring(2) + "\r\n");
/* 924:    */               }
/* 925:846 */               else if (charline[1] == 'C')
/* 926:    */               {
/* 927:848 */                 if (charline[0] == '4') {
/* 928:849 */                   EndConditional = i + 3;
/* 929:    */                 }
/* 930:850 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "20" + line.substring(2) + "\r\n");
/* 931:    */               }
/* 932:852 */               else if (charline[1] == 'D')
/* 933:    */               {
/* 934:854 */                 if (charline[0] == '4') {
/* 935:855 */                   EndConditional = i + 3;
/* 936:    */                 }
/* 937:856 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "21" + line.substring(2) + "\r\n");
/* 938:    */               }
/* 939:858 */               else if ((charline[1] == '8') || (charline[1] == '9'))
/* 940:    */               {
/* 941:860 */                 if (charline[0] == '4') {
/* 942:861 */                   EndConditional = i + 3;
/* 943:    */                 }
/* 944:862 */                 this.jTextPane2.setText(this.jTextPane2.getText() + "2" + line.substring(1, 7));
/* 945:863 */                 if (charline[7] == '1') {
/* 946:864 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "0");
/* 947:865 */                 } else if (charline[7] == '3') {
/* 948:866 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "2");
/* 949:867 */                 } else if (charline[7] == '5') {
/* 950:868 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "4");
/* 951:869 */                 } else if (charline[7] == '7') {
/* 952:870 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "6");
/* 953:871 */                 } else if (charline[7] == '9') {
/* 954:872 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "8");
/* 955:873 */                 } else if (charline[7] == 'B') {
/* 956:874 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "A");
/* 957:875 */                 } else if (charline[7] == 'D') {
/* 958:876 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "C");
/* 959:877 */                 } else if (charline[7] == 'F') {
/* 960:878 */                   this.jTextPane2.setText(this.jTextPane2.getText() + "E");
/* 961:    */                 } else {
/* 962:880 */                   this.jTextPane2.setText(this.jTextPane2.getText() + charline[7]);
/* 963:    */                 }
/* 964:881 */                 this.jTextPane2.setText(this.jTextPane2.getText() + " FF0000" + line.substring(15, 17) + "\r\n");
/* 965:    */               }
/* 966:    */             }
/* 967:    */           }
/* 968:    */         }
/* 969:    */       }
/* 970:    */       else
/* 971:    */       {
/* 972:887 */         this.jTextPane2.setText(this.jTextPane2.getText() + line + "\r\n");
/* 973:888 */         LastWasCode = false;
/* 974:    */       }
/* 975:890 */     } while (pos2 > 0);
/* 976:891 */     if (i == EndConditional) {
/* 977:892 */       this.jTextPane2.setText(this.jTextPane2.getText() + "E2000001 80008000\r\n");
/* 978:    */     }
/* 979:893 */     this.jTextPane2.setText(this.jTextPane2.getText() + "REMEMBER: When you Convert\r\n" + "these codes YOU DO NOT GET\r\n" + "CREDIT FOR THE CODE, it's \r\n" + "the EXACT SAME CODE that it\r\n" + "was for GameCube AR which a\r\n" + "hacker spent his/her time \r\n" + "on creating!!\r\n");
/* 980:    */   }
/* 981:    */   
/* 982:    */   @Action
/* 983:    */   public void clearwiird()
/* 984:    */   {
/* 985:905 */     this.jTextPane2.setText("");
/* 986:    */   }
/* 987:    */   
/* 988:    */   @Action
/* 989:    */   public void cleargcn()
/* 990:    */   {
/* 991:910 */     this.jTextPane1.setText("");
/* 992:    */   }
/* 993:    */   
/* 994:931 */   private final Icon[] busyIcons = new Icon[15];
/* 995:932 */   private int busyIconIndex = 0;
/* 996:    */   //private JDialog aboutBox;
/* 997:    */ }


/* Location:           D:\Downloads\ARtoWiiRD_v0.9\ARtoWiiRD_v0.9\AR to WiiRD.jar
 * Qualified Name:     artowiird.ARtoWiiRDView
 * JD-Core Version:    0.7.0.1
 */