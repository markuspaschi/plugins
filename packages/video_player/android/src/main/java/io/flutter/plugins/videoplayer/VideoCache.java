package io.flutter.plugins.videoplayer;

import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import java.io.File;

public class VideoCache {
    private static SimpleCache sDownloadCache;

    public static SimpleCache getInstance() {
        if (sDownloadCache == null) sDownloadCache = new SimpleCache(new File("/storage/emulated/0/Movies/challenge_friends/cache/"), new LeastRecentlyUsedCacheEvictor(300 * 1024 * 1024));
        return sDownloadCache;
    }
}