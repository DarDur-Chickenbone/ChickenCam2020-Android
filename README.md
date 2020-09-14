# ChickenCam for Android - September 2020
    
## What's new?
    * Cleaned UI - Not complete yet
    * Added FAQ
    * Autocrop soon
    
## What is ChickenCam?
Chickencam is a Snapchat tool that allows users to send gallery images and videos or custom stickers to friends using Snapchat's SDK. Normally doing so would cause Snapchat to send images in a text chat or Snapchat stories to have "from Gallery" text.

## What is the point?
While others would charge you for Snapchat's own app Chickencam is completely open source and free.
* Allow you to take HQ photos with your stock phone camera
* Used to make custom stickers
* Edit photos/vids better with other software

## Could I be banned for using this?
No, this is a revamped version of Snapchat's creative sample app. Meaning Snapchat would ban you for using their own app. Posting nasty things however will get you banned if people report you.

## How do I install? [Video to be updated soon](https://www.youtube.com/watch?v=2FkhBCqLKNY)
1. Create an account at kit.snapchat.com
2. Create app and scroll to development enviroment. Inside android package type "com.snapchat.kit.chickencam" and switch it on.
3. Download this zip and install Android Studio. In Android Studio install your phone's SDK (your phone's android version).
4. Open the project and go into AndroidManifest.xml. Inside on Line 20 paste the Auth Code found under where you typed the package name in Snapkit.
5. Go into Snapkit and add your username.
6. Go to the top in Android Studio Build>Generate Signed APK. Choose APK>Create Keypath. (Keypath doesn't matter make your own).
7. Hit release and v2 Full APK and move the APK to your phone and install. That's it.

## Could you build it for me?
No

## FAQ/Common Issues

### Why do my stories show "from *APP_NAME*"?
Because Snapchat requires all their developer apps to say this. You can workaround this, however. There are two methods which the first works best.

* The Memory Method - This will completely eliminate "from".
  1. Upload photo/vid to Snapchat
  2. Finish editing and save photo to memories
  3. Exit the photo and go to memories and upload the same photo/image.

* Renaming app name - this won't remove "from" but will change what it says its from
  1. Open project in andrid studio and navigate to
  
          res>values>strings.xml
  2. Change the 2nd line. The default is "Camera" *(from camera)*
  
### Why do my photos/vids have black borders?
Because you didn't edit them correctly. You need to crop the photos to your phone's dimensions or whatever you prefer. Either Google your device's or take a full screen photo and look at the dimensions. Besides that 9:16 is the *common* aspect ratio.

### Why won't my video upload?
Because Snapchat limits it to 10sec max and 10mb. Split the video to 10 second parts and compress under 10mb if needed. Sometimes it allows videos to be above 10sec if under 10mb but is vert rare.

### How do I use custom stickers
As of now Snapchat only allows pngs on Android whereas iOS gets PNG/GIFs

On your pc navigate through the project's folder: 

    ChickenCam-2020\android\creative-sample-app\src\main\assets\

Replace stickers.png WITH the same name.

### It says "error while parsing the package" when I try to install
Try checking both v1 and v2 when building apk.

### Invalid VCS Root Mapping
Delete vcs.xml in android>.idea
