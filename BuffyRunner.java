///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS com.google.protobuf:protobuf-java:3.22.2
//SOURCES generated-buffies/java/BuffyOuterClass.java

import static java.lang.System.*;
import java.io.*;
import com.google.protobuf.InvalidProtocolBufferException;

public class BuffyRunner {

    public static void main(String... args) throws InvalidProtocolBufferException, FileNotFoundException, IOException {
        var decodedBuffy = BuffyOuterClass.Buffy.parseFrom(new FileInputStream("buffy.bin"));
    }
}
