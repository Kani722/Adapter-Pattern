# Adapter Design Pattern Example

This repository demonstrates the Adapter Design Pattern in Java. The Adapter Design Pattern allows incompatible interfaces to work together by providing a bridge between two classes. In this example, we adapt an `AdvancedMediaPlayer` interface to work with a `MediaPlayer` interface using an adapter class.

## Overview

The main class `Main` demonstrates the use of the adapter design pattern. The pattern is implemented by creating a `MediaAdapter` that allows `AdvancedMediaPlayer` classes (`VlcPlayer` and `Mp4Player`) to be used where a `MediaPlayer` is expected.

## Classes

- **MediaPlayer**: An interface with the method `play(String audioType, String fileName)`.
- **AudioPlayer**: A class implementing the `MediaPlayer` interface, capable of playing `mp3` files directly and using an adapter for other formats.
- **AdvancedMediaPlayer**: An interface with methods `playVlc(String fileName)` and `playMp4(String fileName)`.
- **VlcPlayer**: A class implementing the `AdvancedMediaPlayer` interface, capable of playing `vlc` files.
- **Mp4Player**: A class implementing the `AdvancedMediaPlayer` interface, capable of playing `mp4` files.
- **MediaAdapter**: A class implementing the `MediaPlayer` interface that adapts `AdvancedMediaPlayer` classes (`VlcPlayer`, `Mp4Player`) to be used where `MediaPlayer` is expected.

## Main Class: Main

The `Main` class contains the `main` method, which demonstrates the following:

- Creating an `AudioPlayer` object and using it directly to play `mp3` files.
- Using the `MediaAdapter` to play other formats (`mp4` and `vlc`).
- Handling unsupported formats gracefully.

How the Adapter Pattern Works
The 'AudioPlayer' directly plays mp3 files using its play method.
For unsupported formats like mp4 and vlc, the AudioPlayer uses the MediaAdapter.
The MediaAdapter adapts the VlcPlayer and Mp4Player classes, which implement the AdvancedMediaPlayer interface, to the MediaPlayer interface expected by AudioPlayer.
This allows the AudioPlayer to treat VlcPlayer and Mp4Player as if they were MediaPlayer.
