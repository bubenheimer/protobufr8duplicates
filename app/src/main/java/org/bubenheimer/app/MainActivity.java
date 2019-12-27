package org.bubenheimer.app;

import android.app.Activity;
import android.os.Bundle;

import com.google.protobuf.util.Timestamps;
import com.google.rpc.Status;

import io.grpc.protobuf.StatusProto;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timestamps.fromMillis(System.currentTimeMillis());

        throw StatusProto.toStatusRuntimeException(Status.getDefaultInstance());
    }
}
