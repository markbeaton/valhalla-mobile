#include <boost/property_tree/ptree.hpp>
#include <valhalla/tyr/actor.h>
#include <valhalla/baldr/rapidjson_utils.h>
#include <valhalla/loki/worker.h>
#include "valhalla_actor.h"

std::string ValhallaActor::route(const std::string& request, const std::string& config_path) {
    // Get the config path
    std::string config_file(config_path);
    
    // Set up the config object
    boost::property_tree::ptree(config);
    rapidjson::read_json(config_file, config);
    
    // Setup the actor
    valhalla::tyr::actor_t actor = valhalla::tyr::actor_t(config);
    
    // Convert the request to a std::string
    std::string req = std::string(request);
    
    // Produce the route result
    std::string result = actor.route(req);
    
    return result;
}

std::string ValhallaActor::trace_route(const std::string& request, const std::string& config_path) {
    // Get the config path
    std::string config_file(config_path);
    
    // Set up the config object
    boost::property_tree::ptree(config);
    rapidjson::read_json(config_file, config);
    
    // Setup the actor
    valhalla::tyr::actor_t actor = valhalla::tyr::actor_t(config);
    
    // Convert the request to a std::string
    std::string req = std::string(request);
    
    // Produce the trace_route result
    std::string result = actor.trace_attributes(req);
    
    return result;
}


std::string ValhallaActor::trace_attributes(const std::string& request, const std::string& config_path) {
    // Get the config path
    std::string config_file(config_path);
    
    // Set up the config object
    boost::property_tree::ptree(config);
    rapidjson::read_json(config_file, config);
    
    // Setup the actor
    valhalla::tyr::actor_t actor = valhalla::tyr::actor_t(config);
    
    // Convert the request to a std::string
    std::string req = std::string(request);
    
    // Produce the trace_attributes result
    std::string result = actor.trace_attributes(req);
    
    return result;
}
