package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin());
      com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin.registerWith(shimPluginRegistry.registrarFor("com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin"));
      io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebaseauth.FirebaseAuthPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FirebaseCorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin());
      dev.bughub.flt_video_player.FltVideoPlayerPlugin.registerWith(shimPluginRegistry.registrarFor("dev.bughub.flt_video_player.FltVideoPlayerPlugin"));
      com.sidlatau.flutteremailsender.FlutterEmailSenderPlugin.registerWith(shimPluginRegistry.registrarFor("com.sidlatau.flutteremailsender.FlutterEmailSenderPlugin"));
    flutterEngine.getPlugins().add(new com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin());
      io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin.registerWith(shimPluginRegistry.registrarFor("io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.googlesignin.GoogleSignInPlugin());
    flutterEngine.getPlugins().add(new de.ffuf.in_app_update.InAppUpdatePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.packageinfo.PackageInfoPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.share.SharePlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
  }
}
