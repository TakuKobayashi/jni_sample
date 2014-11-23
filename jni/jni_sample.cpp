#include <jni.h>
#include <string.h>
#include <android/log.h>

extern "C" {
  JNIEXPORT jstring JNICALL Java_com_taku_kobayashi_jnisample_MainActivity_hello(JNIEnv* env,jobject thiz){
    __android_log_print(ANDROID_LOG_INFO, __FILE__, "hoge");
    //when use C
    //return (*env)->NewStringUTF(env, "Hello world!");
    return env->NewStringUTF("Hello world!");
  }

  JNIEXPORT jintArray JNICALL Java_com_taku_kobayashi_jnisample_MainActivity_changepixels(JNIEnv* env, jobject thiz, jintArray colors, jint w, jint h){
	  jint* bmpColors = (*env)->GetIntArrayElements(env, colors, 0);
	  for (int i = 0; i < (w * h); ++i){

	  }
	  (*env)->ReleaseIntArrayElements(env, colors, bmpColors, 0);
	  return null;
  }
}
