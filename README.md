# ChickenCam-2020 - ANDROID ONLY

## Who made this?
Join original developer Justxn's Server for the first Snapchat Web Client (25 Invites per month so be quick!)

Based off of https://github.com/JReverse/creative-kit-sample

## What is this app?
By default when uploading a gallery photo to Snapchat either to a friend or story, it will either send via chat or add a annoying watermark to your story. Chickencam eliminates this, by using Snapchat's developer kit you could completely bypass this.
### Use this to:
* Upload stock camera photos/videos without shitty snapchat quality
* High Quality Advertisments
* Custom GIF/Stickers

## Why this App?
People in the past have created similar apps and charged people hundreds of dollars just to use it. ChickenCam is completely free and open source so it will stop sketchy scammers

## Will I get banned for using this?
It is known that passed Snapchat tweaks would result in a ban, for example Casper, Snaptools, etc. However because this is directly from Snapchat's developer kit there is absolutely no chance of being banned. **Keep in mind there is a risk of someone reporting you for uploading something "nasty" -- be careful of who's on your friend's list.**

## Installation
*Refer to this [video](https://youtu.be/2FkhBCqLKNY) or follow the steps below*
**Before you even begin install Android Studio and your SDK version, download this zip.**
1. Create a account at https://kit.snapchat.com/portal/
  2. Create an app (Click Add button) - Only change name. Don't Disable/Enable anything. Click continue.
  **DO NOT SUBMIT FOR REVIEW AT ANY TIME**
  4. Scroll down to -Development Enviroment- and check android
  5. Copy and paste "com.snapchat.kit.creativesample" in "Add your name" ... Copy client ID after that
  6. Extract the ZIP anywhere, and open the project with android studio
  7. Find and Open androidmanifest and paste your code at android:value="(pastecode)"
  8. Go back to Snapkit and scroll to the bottom, and add your username
  9. Build>Generate Signed Apk>APK> ... Create a keypath> Next> Check V2 Full Signature> Finish
  10. Put apk on phone and install
  
  ## Limitations
  ### Snapchat adds the text "from" when uploading to your public story. There are two workarounds though.
  * The "Memory Method"
  1. Upload to Snapchat and do whatever you want to customize the Snap
  2. When you're done save the photo to memories then hit the X
  3. Go into your memories and find the photo then just upload to story
  Doing this there shouldn't be any "from" text and it should look completely normal.
  * Renaming the App
  
  By default the app is named Camera, meaning if you upload a photo straight to your story it will show "from camera". You are able to rename it to whatever you want though. Keep in mind if you want to be completely stealth the first workaround is for you. **Check stringexamples.png to check examples of different names.**
  1. In Android Studio go to Creative-sample-Act -> res -> values -> strings.xml
  2. Rename Camera to whatever you want
  
  ### Snapchat limits the size and length of your video
  Snapchat limits the video size to below 10mb and 10 seconds. We could workaround this by compressing the video in the program Handbrake and splitting the video into 10 second clips.
  
