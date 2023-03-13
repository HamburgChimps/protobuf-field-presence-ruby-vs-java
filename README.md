# Protobuf Field Presence - Ruby vs. Java

This is a little experiment to demonstrate the different way the Google protobuf libraries for ruby and java handle missing fields when deserializing protobufs. The Java library throws an error if it determines a field is missing, whereas the ruby library is totally fine with it. It is up to you as the developer to check for the presence of the field on the deserialized object. I ran into this discrepency while working on another project and wanted to isolate the behavior in a small demonstration.

All in all, this information isn't really that pertinant or useful, especially since protobuf v3 removed the `required` and `optional` modifiers. However, found it interesting to demonstrate this protobuf v2 behavior in an isolated example.

Side note: jbang is pretty cool! Makes it pretty easy to run small little java programs with minimal hassle.

## Testing it yourself

Run `bundle install`.

Run `bundle exec ruby buffy.rb` to execute the [ruby example](buffy.rb), and notice the succesfully deserialized object that gets logged to the console.

Use [`jbang`](https://www.jbang.dev/) to run the [java example](BuffyRunner.java) and notice that an exception regarding a missing field is thrown.
