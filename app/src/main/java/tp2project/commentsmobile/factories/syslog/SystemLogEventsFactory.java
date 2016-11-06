package tp2project.commentsmobile.factories.syslog;

import org.joda.time.DateTime;

import tp2project.commentsmobile.domain.syslog.SystemLogEvents;

/**
 * Created by Quest on 2016/11/06.
 */

public class SystemLogEventsFactory {

    public static SystemLogEvents getSystemLogEvents(String orgCode, String id, String eventType, String eventName, String message, DateTime date){
        SystemLogEvents systemLogEvents = new SystemLogEvents.Builder()
                .getOrgCode(orgCode)
                .getId(id)
                .getEventType(eventType)
                .getEventName(eventName)
                .getMessage(message)
                .getDate(date)
                .build();
        return systemLogEvents;
    }
}
