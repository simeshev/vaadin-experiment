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
      RouterLink link = new RouterLink();
      // Use Lumo classnames for various styling
      link.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.XSMALL,
              LumoUtility.Height.MEDIUM, LumoUtility.AlignItems.CENTER,
              LumoUtility.Padding.Horizontal.SMALL, LumoUtility.TextColor.BODY);
      link.setRoute(view);

      Span menuTitleSpan = new Span(menuTitle);

      // Use Lumo classnames for various styling
      menuTitleSpan.addClassNames(LumoUtility.FontWeight.MEDIUM, LumoUtility.FontSize.MEDIUM, LumoUtility.Whitespace.NOWRAP);

      if (icon != null) {
         link.add(icon);
      }
      link.add(menuTitleSpan);
      add(link);
   }

   public Class<?> getView() {

      return view;
   }

}
