#include <jni.h>
#include <iostream>
#include "Lab1.h"
using namespace std;

JNIEXPORT jint JNICALL Java_Lab1_getArithmeticMean(JNIEnv *env, jobject, jintArray arrayOfNumbers){
    jint length = env->GetArrayLength(arrayOfNumbers);
    jint *array = env->GetIntArrayElements(arrayOfNumbers, 0);
    int add = 0;
    for (int i = 0; i < length; i++){
        add = add + array[0];
    }
    int mean = add / length;
    cout << mean << << "" <<endl;
    return 0;
}