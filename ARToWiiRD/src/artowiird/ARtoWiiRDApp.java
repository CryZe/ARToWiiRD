/*  1:   */ package artowiird;
/*  2:   */ 
/*  3:   */ import java.awt.Window;
/*  4:   */ import org.jdesktop.application.Application;
/*  5:   */ import org.jdesktop.application.SingleFrameApplication;
/*  6:   */ 
/*  7:   */ public class ARtoWiiRDApp
/*  8:   */   extends SingleFrameApplication
/*  9:   */ {
/* 10:   */   protected void startup()
/* 11:   */   {
/* 12:19 */     show(new ARtoWiiRDView(this));
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void configureWindow(Window root) {}
/* 16:   */   
/* 17:   */   public static ARtoWiiRDApp getApplication()
/* 18:   */   {
/* 19:35 */     return (ARtoWiiRDApp)Application.getInstance(ARtoWiiRDApp.class);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public static void main(String[] args)
/* 23:   */   {
/* 24:42 */     launch(ARtoWiiRDApp.class, args);
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\Downloads\ARtoWiiRD_v0.9\ARtoWiiRD_v0.9\AR to WiiRD.jar
 * Qualified Name:     artowiird.ARtoWiiRDApp
 * JD-Core Version:    0.7.0.1
 */