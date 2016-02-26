#import <Cordova/CDV.h>
#import "CDVEcho.h"

@interface CDVEcho () {}
@end

@implementation CDVEcho

+ (NSString*)cordovaVersion
{
    return CDV_VERSION;
}

@end
