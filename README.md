# Exp2ActivityLifeCycle

See it in [Activity Lifecycle][1] (at Android Developers).

![](sample/activity_lifecycle.png)


onCreate():
```
Called when the activity is first created. This is where you should do all of your normal static set up: 
create views, bind data to lists, etc. This method also provides you with a Bundle containing the 
activity's previously frozen state, if there was one. Always followed by onStart().
```
onRestart():
```
Called after your activity has been stopped, prior to it being started again. Always followed by onStart()
```
onStart():
```
Called when the activity is becoming visible to the user. Followed by onResume() if the activity comes to 
the foreground, or onStop() if it becomes hidden.
```
onResume():
```
Called when the activity will start interacting with the user. At this point your activity is at the top of
the activity stack, with user input going to it. Always followed by onPause().
```
onPause ():
```
Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) 
been killed. The counterpart to onResume(). When activity B is launched in front of activity A, this callback
will be invoked on A. B will not be created until A's onPause() returns, so be sure to not do anything 
lengthy here.
```
onStop():
```
Called when you are no longer visible to the user. You will next receive either onRestart(), onDestroy(), 
or nothing, depending on later user activity.

Note that this method may never be called, in low memory situations where the system does not have enough
memory to keep your activity's process running after its onPause() method is called.
```
onDestroy():
```
The final call you receive before your activity is destroyed. This can happen either because the activity
is finishing (someone called finish() on it, or because the system is temporarily destroying this instance
of the activity to save space. You can distinguish between> these two scenarios with the isFinishing() method.
```


```java
```

License
--------

    Copyright 2017 Gennext It, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: https://developer.android.com/reference/android/app/Activity#ActivityLifecycle
