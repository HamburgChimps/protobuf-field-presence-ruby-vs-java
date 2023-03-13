require_relative 'generated-buffies/ruby/buffy_pb.rb'

decoded_buffy = Buffy.decode(File.binread("buffy.bin"))
puts decoded_buffy
