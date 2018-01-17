cmake_minimum_required(VERSION 3.4.1)

add_library(native-common SHARED
            native-common.c)

target_link_libraries(native-common
                      android
                      log)