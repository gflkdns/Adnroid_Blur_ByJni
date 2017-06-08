cmake_minimum_required(VERSION 3.4.1)
find_library(
              log-lib
              log )

add_library(
             static-blur
             SHARED
             src/main/cpp/stackblur.c)

target_link_libraries(static-blur jnigraphics
                       ${log-lib} )
add_library(
             mqt-blur
             SHARED
             src/main/cpp/com_mqt_cmakedemo2_BlurUtils.c)

target_link_libraries(mqt-blur jnigraphics static-blur
                       ${log-lib} )

