package example.quarkusmetrics;

import org.eclipse.microprofile.metrics.Histogram;
import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.ConcurrentGauge;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Metered;
import org.eclipse.microprofile.metrics.annotation.Metric;
import org.eclipse.microprofile.metrics.annotation.Timed;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Path("/")
public class MainResource {

  /*  @Inject
    MetricRegistry registry;

    @Inject
    @Metric(name = "histogram")
    Histogram histogram;

    @GET
    @Produces("text/plain")
    @Path("/counter")
    @Counted
    public String counter() {
        return "OK";
    }*/

  @GET
  @Path("/get")
  public void getAnnotationsReflectively() throws NoSuchMethodException {
      System.out.println(Arrays.toString(MainResource.class.getMethod("XXX").getAnnotations()));
  }

    @GET
    @Produces("text/plain")
    @Path("/xxx")
    public String XXX() {
        return "OK";
    }
/*
    @GET
    @Produces("text/plain")
    @Path("/gauge")
    @Gauge(name = "gauge", absolute = true, unit = MetricUnits.NONE)
    public Long gauge() {
        return ThreadLocalRandom.current().nextLong(100);
    }

    @GET
    @Produces("text/plain")
    @Path("/timer")
    @Timed(name = "timer", absolute = true)
    public String timer() throws InterruptedException {
        long wait = ThreadLocalRandom.current().nextLong(1000);
        TimeUnit.MILLISECONDS.sleep(wait);
        return "OK, waited " + wait + " milliseconds";
    }

    @GET
    @Produces("text/plain")
    @Path("/histogram")
    public String histogram() {
        long number = ThreadLocalRandom.current().nextLong(1000);
        histogram.update(number);
        return "OK, added " + number + " to the histogram";
    }

    @GET
    @Produces("text/plain")
    @Path("/meter")
    @Metered(name = "meter", absolute = true)
    public String meter() throws InterruptedException {
        long wait = ThreadLocalRandom.current().nextLong(1000);
        TimeUnit.MILLISECONDS.sleep(wait);
        return "OK, waited " + wait + " milliseconds";
    }

    @GET
    @Produces("text/plain")
    @Path("/cgauge")
    @ConcurrentGauge(name = "cgauge", absolute = true)
    public String cgauge() throws InterruptedException {
        System.out.println("sleeping...");
        TimeUnit.SECONDS.sleep(10);
        return "OK, slept for 10 seconds";
    }*/


}