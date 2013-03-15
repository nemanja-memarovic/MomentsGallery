

import java.util.Date;

import models.AppLogger;
import controllers.MomentsGalleryController;
import play.*;

public class Global extends GlobalSettings {

  @Override
  public void onStart(Application app) {
	AppLogger.addNew(new AppLogger(MomentsGalleryController.appName, "APP START", new Date().toString(), "", "null"));
    Logger.info("Glogal: OnStart: Application has started...");
    //Logger.info("Glogal: OnStart: Starting INITInstagram...");
    MomentsGalleryController.initInstagram();
  }  
  
  @Override
  public void onStop(Application app) {
	AppLogger.addNew(new AppLogger(MomentsGalleryController.appName, "APP END", new Date().toString(), "", "null"));
    Logger.info("Global: OnStop: Application shutdown...");
    
  }  
    
}