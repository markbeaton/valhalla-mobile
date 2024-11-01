#ifndef WRAPPER_H
#define WRAPPER_H

#include "valhalla_actor.h"

#ifdef __ANDROID__
#include <jni.h>


#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring JNICALL Java_com_valhalla_valhalla_ValhallaKotlin_route(JNIEnv *env,
                                                jobject thiz,
                                                jstring jRequest,
                                                jstring jConfigPath);

JNIEXPORT jstring JNICALL Java_com_valhalla_valhalla_ValhallaKotlin_trace_route(JNIEnv *env,
                                                jobject thiz,
                                                jstring jRequest,
                                                jstring jConfigPath);

JNIEXPORT jstring JNICALL Java_com_valhalla_valhalla_ValhallaKotlin_trace_attributes(JNIEnv *env,
                                                jobject thiz,
                                                jstring jRequest,
                                                jstring jConfigPath);

#ifdef __cplusplus
}
#endif

#elif __APPLE__

std::string route(const char *request, const char *config_path);
std::string trace_route(const char *request, const char *config_path);
std::string trace_attributes(const char *request, const char *config_path);

#endif

#endif // WRAPPER_H