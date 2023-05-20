package com.effectiveem.app.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

/**
 * A simple navigation item component, based on ListItem element.
 */
public final class MenuItemInfo extends ListItem {

   private final Class<? extends Component> view;

   public MenuItemInfo(String menuTitle, Component icon, Class<? extends Component> view) {

      this.view = view;
      RouterLink routerLink = new RouterLink();
      // Use Lumo classnames for various styling
      routerLink.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.XSMALL,
              LumoUtility.Height.MEDIUM, LumoUtility.AlignItems.CENTER,
              LumoUtility.Padding.Horizontal.SMALL, LumoUtility.TextColor.BODY);
      routerLink.setRoute(view);

      Span menuTitleSpan = new Span(menuTitle);

      // Use Lumo classnames for various styling
      menuTitleSpan.addClassNames(LumoUtility.FontWeight.MEDIUM, LumoUtility.FontSize.MEDIUM, LumoUtility.Whitespace.NOWRAP);

      if (icon != null) {
         routerLink.add(icon);
      }
      routerLink.add(menuTitleSpan);
      add(routerLink);
   }

   public Class<?> getView() {

      return view;
   }

}
