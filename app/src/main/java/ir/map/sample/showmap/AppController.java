package ir.map.sample.showmap;

import android.app.Application;

import ir.map.sdk_map.Mapir;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Mapir.getInstance(this, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImU0ZTc5N2Q3N2YxYjQ1NDM0MDI0NWQ5Mzk1M2Y5OTQyMjEzMGQ3YmYwZTZmODE4N2U3NmQ3OTA3NjgzZDZhYjhmMGZkZTRlZWEyN2M3N2Y4In0.eyJhdWQiOiI5NTg1IiwianRpIjoiZTRlNzk3ZDc3ZjFiNDU0MzQwMjQ1ZDkzOTUzZjk5NDIyMTMwZDdiZjBlNmY4MTg3ZTc2ZDc5MDc2ODNkNmFiOGYwZmRlNGVlYTI3Yzc3ZjgiLCJpYXQiOjE1OTE3ODk0MDIsIm5iZiI6MTU5MTc4OTQwMiwiZXhwIjoxNTk0MzgxNDAyLCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.TK90qUJ1R3Ma4XWfRhdaF46xN6Tso6rstEB9SgPVatSIR_3t2Ompcw5gDHzpTdCP9QuF9t2NEO3XJP1H1cic_laat2I_9i2cAjawHvyM9i6n1GrMrLgyIQs8-XI1Rk35o0pn0SlWjQsljubd6Tc40wf9W8h2Xdz2espzvODeIDVRzHoGVlSBHqR2WJ9rtGqkA400X3B3-XgRMeVbs4uaLFm1sSGROrRP7w3jvWkXZpi3OthEAng5UiSypZTxiJHGtA_NdJ7ntQEYXXojs-XJ7lIW9B61_7SzVeMnVt6gSQ1qXJvIn7kL3myoEKayKylvKOAgpJPOc-QAKmgW0E0xzQ");
    }
}